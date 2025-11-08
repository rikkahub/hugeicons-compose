package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageDownload: ImageVector
    get() {
        if (_imageDownload != null) {
            return _imageDownload!!
        }
        _imageDownload = ImageVector.Builder(
            name = "ImageDownload",
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
        moveTo(5f, 21f)
        curveTo(9.20998f, 16.2487f, 13.9412f, 9.9475f, 21f, 14.6734f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 3.00231f)
        curveTo(13.5299f, 3f, 12.0307f, 3f, 11.5f, 3f)
        curveTo(7.02166f, 3f, 4.78249f, 3f, 3.39124f, 4.39124f)
        curveTo(2f, 5.78249f, 2f, 8.02166f, 2f, 12.5f)
        curveTo(2f, 16.9783f, 2f, 19.2175f, 3.39124f, 20.6088f)
        curveTo(4.78249f, 22f, 7.02166f, 22f, 11.5f, 22f)
        curveTo(15.9783f, 22f, 18.2175f, 22f, 19.6088f, 20.6088f)
        curveTo(20.9472f, 19.2703f, 20.998f, 17.147f, 20.9999f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 7.5f)
        curveTo(17.4915f, 8.0057f, 18.7998f, 10f, 19.5f, 10f)
        moveTo(22f, 7.5f)
        curveTo(21.5085f, 8.0057f, 20.2002f, 10f, 19.5f, 10f)
        moveTo(19.5f, 10f)
        verticalLineTo(2f)
        }
        }.build()

        return _imageDownload!!
    }

private var _imageDownload: ImageVector? = null
