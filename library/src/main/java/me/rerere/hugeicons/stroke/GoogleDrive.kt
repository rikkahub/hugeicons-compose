package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoogleDrive: ImageVector
    get() {
        if (_googleDrive != null) {
            return _googleDrive!!
        }
        _googleDrive = ImageVector.Builder(
            name = "GoogleDrive",
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
        moveTo(20.0165f, 19.4118f)
        lineTo(21.4236f, 16.8293f)
        curveTo(21.811f, 16.1181f, 22.0048f, 15.7625f, 21.9999f, 15.3776f)
        curveTo(21.995f, 14.9927f, 21.7923f, 14.642f, 21.3869f, 13.9404f)
        lineTo(15.9448f, 4.52296f)
        curveTo(15.5155f, 3.78003f, 15.3009f, 3.40856f, 14.9431f, 3.20428f)
        curveTo(14.5852f, 3f, 14.1493f, 3f, 13.2773f, 3f)
        horizontalLineTo(10.7227f)
        curveTo(9.85074f, 3f, 9.41475f, 3f, 9.05694f, 3.20428f)
        curveTo(8.69913f, 3.40856f, 8.48447f, 3.78003f, 8.05515f, 4.52296f)
        lineTo(2.61306f, 13.9404f)
        curveTo(2.20767f, 14.642f, 2.00497f, 14.9927f, 2.00009f, 15.3776f)
        curveTo(1.99521f, 15.7625f, 2.18895f, 16.1181f, 2.57643f, 16.8293f)
        lineTo(3.98351f, 19.4118f)
        curveTo(4.40512f, 20.1856f, 4.61592f, 20.5725f, 4.97988f, 20.7862f)
        curveTo(5.34384f, 21f, 5.7918f, 21f, 6.68772f, 21f)
        horizontalLineTo(17.3123f)
        curveTo(18.2082f, 21f, 18.6562f, 21f, 19.0201f, 20.7862f)
        curveTo(19.3841f, 20.5725f, 19.5949f, 20.1856f, 20.0165f, 19.4118f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 4f)
        lineTo(16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.5f, 20.5f)
        lineTo(12f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 15f)
        horizontalLineTo(9f)
        }
        }.build()

        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
