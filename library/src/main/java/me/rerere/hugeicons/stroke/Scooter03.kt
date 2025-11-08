package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Scooter03: ImageVector
    get() {
        if (_scooter03 != null) {
            return _scooter03!!
        }
        _scooter03 = ImageVector.Builder(
            name = "Scooter03",
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
        moveTo(10f, 4f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 4f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 20f)
        curveTo(7.6725f, 19.9645f, 6.90036f, 19.8282f, 6.42177f, 19.3045f)
        curveTo(5.77472f, 18.5965f, 5.9693f, 17.5144f, 6.35847f, 15.35f)
        lineTo(6.96989f, 11.9497f)
        curveTo(7.21514f, 10.5857f, 7.33777f, 9.90371f, 7.69445f, 9.38625f)
        curveTo(8.0453f, 8.87725f, 8.55358f, 8.47814f, 9.15294f, 8.24104f)
        curveTo(9.76224f, 8f, 10.5082f, 8f, 12f, 8f)
        curveTo(13.4918f, 8f, 14.2378f, 8f, 14.8471f, 8.24104f)
        curveTo(15.4464f, 8.47814f, 15.9547f, 8.87725f, 16.3056f, 9.38625f)
        curveTo(16.6622f, 9.90371f, 16.7849f, 10.5857f, 17.0301f, 11.9497f)
        lineTo(17.6415f, 15.35f)
        curveTo(18.0307f, 17.5144f, 18.2253f, 18.5965f, 17.5782f, 19.3045f)
        curveTo(17.1018f, 19.8258f, 16.3345f, 19.9636f, 15.018f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }
        }.build()

        return _scooter03!!
    }

private var _scooter03: ImageVector? = null
