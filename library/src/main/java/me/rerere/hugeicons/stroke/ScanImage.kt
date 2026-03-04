package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ScanImage: ImageVector
    get() {
        if (_scanImage != null) {
            return _scanImage!!
        }
        _scanImage = ImageVector.Builder(
            name = "ScanImage",
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
        moveTo(8.5f, 2.5f)
        curveTo(7.57099f, 2.5f, 7.10649f, 2.5f, 6.71783f, 2.56156f)
        curveTo(4.57837f, 2.90042f, 2.90042f, 4.57837f, 2.56156f, 6.71783f)
        curveTo(2.5f, 7.10649f, 2.5f, 7.57099f, 2.5f, 8.5f)
        moveTo(15.5f, 2.5f)
        curveTo(16.429f, 2.5f, 16.8935f, 2.5f, 17.2822f, 2.56156f)
        curveTo(19.4216f, 2.90042f, 21.0996f, 4.57837f, 21.4384f, 6.71783f)
        curveTo(21.5f, 7.10649f, 21.5f, 7.57099f, 21.5f, 8.5f)
        moveTo(2.5f, 15.5f)
        curveTo(2.5f, 16.429f, 2.5f, 16.8935f, 2.56156f, 17.2822f)
        curveTo(2.90042f, 19.4216f, 4.57837f, 21.0996f, 6.71783f, 21.4384f)
        curveTo(7.10649f, 21.5f, 7.57099f, 21.5f, 8.5f, 21.5f)
        moveTo(15.5f, 21.5f)
        curveTo(16.429f, 21.5f, 16.8935f, 21.5f, 17.2822f, 21.4384f)
        curveTo(19.4216f, 21.0996f, 21.0996f, 19.4216f, 21.4384f, 17.2822f)
        curveTo(21.5f, 16.8935f, 21.5f, 16.429f, 21.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.87868f, 6.87868f)
        curveTo(7.75736f, 6f, 9.17157f, 6f, 12f, 6f)
        curveTo(14.8284f, 6f, 16.2426f, 6f, 17.1213f, 6.87868f)
        curveTo(18f, 7.75736f, 18f, 9.17157f, 18f, 12f)
        curveTo(18f, 14.8284f, 18f, 16.2426f, 17.1213f, 17.1213f)
        curveTo(16.2426f, 18f, 14.8284f, 18f, 12f, 18f)
        curveTo(9.17157f, 18f, 7.75736f, 18f, 6.87868f, 17.1213f)
        curveTo(6f, 16.2426f, 6f, 14.8284f, 6f, 12f)
        curveTo(6f, 9.17157f, 6f, 7.75736f, 6.87868f, 6.87868f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.50006f, 15.5002f)
        lineTo(8.03336f, 13.8525f)
        curveTo(8.56725f, 13.2787f, 9.43287f, 13.2787f, 9.96676f, 13.8525f)
        curveTo(10.526f, 14.4534f, 11.4416f, 14.4207f, 11.9623f, 13.7811f)
        lineTo(13.3712f, 12.0507f)
        curveTo(13.9688f, 11.3167f, 15.0313f, 11.3167f, 15.6289f, 12.0507f)
        lineTo(17.7604f, 14.668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 9.48976f)
        verticalLineTo(9.49976f)
        }
        }.build()

        return _scanImage!!
    }

private var _scanImage: ImageVector? = null
