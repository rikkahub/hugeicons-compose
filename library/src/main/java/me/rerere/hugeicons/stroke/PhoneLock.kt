package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PhoneLock: ImageVector
    get() {
        if (_phoneLock != null) {
            return _phoneLock!!
        }
        _phoneLock = ImageVector.Builder(
            name = "PhoneLock",
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
        moveTo(12.5f, 2f)
        horizontalLineTo(8.5f)
        lineTo(9f, 3f)
        horizontalLineTo(12f)
        lineTo(12.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 11f)
        verticalLineTo(10f)
        curveTo(15.5f, 9.17157f, 16.1716f, 8.5f, 17f, 8.5f)
        curveTo(17.8284f, 8.5f, 18.5f, 9.17157f, 18.5f, 10f)
        verticalLineTo(11.0003f)
        moveTo(15f, 15.5f)
        horizontalLineTo(19f)
        curveTo(19.5523f, 15.5f, 20f, 15.0523f, 20f, 14.5f)
        verticalLineTo(12.5f)
        curveTo(20f, 11.9477f, 19.5523f, 11.5f, 19f, 11.5f)
        lineTo(15f, 11.5f)
        curveTo(14.4477f, 11.5f, 14f, 11.9477f, 14f, 12.5f)
        verticalLineTo(14.5f)
        curveTo(14f, 15.0523f, 14.4477f, 15.5f, 15f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.9974f, 6f)
        curveTo(16.9829f, 4.29344f, 16.8882f, 3.35264f, 16.2678f, 2.73223f)
        curveTo(15.5355f, 2f, 14.357f, 2f, 12f, 2f)
        horizontalLineTo(9f)
        curveTo(6.64298f, 2f, 5.46447f, 2f, 4.73223f, 2.73223f)
        curveTo(4f, 3.46447f, 4f, 4.64298f, 4f, 7f)
        verticalLineTo(17f)
        curveTo(4f, 19.357f, 4f, 20.5355f, 4.73223f, 21.2678f)
        curveTo(5.46447f, 22f, 6.64298f, 22f, 9f, 22f)
        horizontalLineTo(12f)
        curveTo(14.357f, 22f, 15.5355f, 22f, 16.2678f, 21.2678f)
        curveTo(16.8882f, 20.6474f, 16.9829f, 19.7066f, 16.9974f, 18.0001f)
        }
        }.build()

        return _phoneLock!!
    }

private var _phoneLock: ImageVector? = null
