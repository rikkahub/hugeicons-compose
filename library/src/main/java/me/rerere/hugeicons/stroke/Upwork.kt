package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Upwork: ImageVector
    get() {
        if (_upwork != null) {
            return _upwork!!
        }
        _upwork = ImageVector.Builder(
            name = "Upwork",
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
        moveTo(2f, 4.5f)
        verticalLineTo(10.75f)
        curveTo(2f, 12.7925f, 3.7075f, 14.5f, 5.75f, 14.5f)
        curveTo(7.7925f, 14.5f, 9.5f, 12.7925f, 9.5f, 10.75f)
        verticalLineTo(4.5f)
        curveTo(10.75f, 7.625f, 13.0965f, 14.5f, 17.625f, 14.5f)
        curveTo(20.0079f, 14.5f, 22f, 12.5079f, 22f, 10.125f)
        curveTo(22f, 7.74208f, 20.0079f, 5.75f, 17.625f, 5.75f)
        curveTo(15.0913f, 5.75f, 13.5912f, 7.625f, 13.25f, 9.5f)
        curveTo(12.9475f, 11.1625f, 11.375f, 19.5f, 11.375f, 19.5f)
        }
        }.build()

        return _upwork!!
    }

private var _upwork: ImageVector? = null
