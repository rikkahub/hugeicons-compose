package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Icon3dRotate: ImageVector
    get() {
        if (_icon3dRotate != null) {
            return _icon3dRotate!!
        }
        _icon3dRotate = ImageVector.Builder(
            name = "Icon3dRotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        curveTo(7.18491f, 16.8269f, 16.4642f, 16.3877f, 22f, 12.3556f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5368f, 2f)
        curveTo(6.98939f, 6.5f, 6.48408f, 17f, 11.9941f, 22f)
        }
        }.build()

        return _icon3dRotate!!
    }

private var _icon3dRotate: ImageVector? = null
