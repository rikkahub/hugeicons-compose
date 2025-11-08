package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiVisionRecognition: ImageVector
    get() {
        if (_aiVisionRecognition != null) {
            return _aiVisionRecognition!!
        }
        _aiVisionRecognition = ImageVector.Builder(
            name = "AiVisionRecognition",
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
        curveTo(22f, 12f, 19f, 19f, 12f, 19f)
        curveTo(5f, 19f, 2f, 12f, 2f, 12f)
        curveTo(2f, 12f, 5f, 5f, 12f, 5f)
        curveTo(18.5f, 5f, 22f, 12f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.6769f, 8.67738f)
        curveTo(11.8274f, 8.44087f, 12.1726f, 8.44087f, 12.3231f, 8.67738f)
        lineTo(12.7586f, 9.36157f)
        curveTo(13.2401f, 10.1182f, 13.8818f, 10.7599f, 14.6384f, 11.2414f)
        lineTo(15.3226f, 11.6769f)
        curveTo(15.5591f, 11.8274f, 15.5591f, 12.1726f, 15.3226f, 12.3231f)
        lineTo(14.6384f, 12.7586f)
        curveTo(13.8818f, 13.2401f, 13.2401f, 13.8818f, 12.7586f, 14.6384f)
        lineTo(12.3231f, 15.3226f)
        curveTo(12.1726f, 15.5591f, 11.8274f, 15.5591f, 11.6769f, 15.3226f)
        lineTo(11.2414f, 14.6384f)
        curveTo(10.7599f, 13.8818f, 10.1182f, 13.2401f, 9.36157f, 12.7586f)
        lineTo(8.67738f, 12.3231f)
        curveTo(8.44087f, 12.1726f, 8.44087f, 11.8274f, 8.67738f, 11.6769f)
        lineTo(9.36157f, 11.2414f)
        curveTo(10.1182f, 10.7599f, 10.7599f, 10.1182f, 11.2414f, 9.36157f)
        lineTo(11.6769f, 8.67738f)
        }
        }.build()

        return _aiVisionRecognition!!
    }

private var _aiVisionRecognition: ImageVector? = null
