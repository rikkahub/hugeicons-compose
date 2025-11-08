package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = ImageVector.Builder(
            name = "Registered",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        horizontalLineTo(12.5f)
        moveTo(9f, 12f)
        verticalLineTo(7f)
        horizontalLineTo(12.5f)
        curveTo(13.8807f, 7f, 15f, 8.11929f, 15f, 9.5f)
        curveTo(15f, 10.8807f, 13.8807f, 12f, 12.5f, 12f)
        moveTo(9f, 12f)
        verticalLineTo(17f)
        moveTo(12.5f, 12f)
        lineTo(15f, 17f)
        }
        }.build()

        return _registered!!
    }

private var _registered: ImageVector? = null
