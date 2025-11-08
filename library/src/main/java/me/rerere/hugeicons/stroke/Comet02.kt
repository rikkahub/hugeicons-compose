package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Comet02: ImageVector
    get() {
        if (_comet02 != null) {
            return _comet02!!
        }
        _comet02 = ImageVector.Builder(
            name = "Comet02",
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
        moveTo(15f, 2f)
        lineTo(13.999f, 3.00098f)
        moveTo(9f, 8f)
        lineTo(12f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.4142f, 10.5858f)
        curveTo(22.1953f, 11.3668f, 22.1953f, 12.6332f, 21.4142f, 13.4142f)
        curveTo(20.6332f, 14.1953f, 19.3668f, 14.1953f, 18.5858f, 13.4142f)
        curveTo(17.8047f, 12.6332f, 17.8047f, 11.3668f, 18.5858f, 10.5858f)
        curveTo(19.3668f, 9.80474f, 20.6332f, 9.80474f, 21.4142f, 10.5858f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.12137f, 16.1631f)
        lineTo(3.0226f, 13.3169f)
        curveTo(3.24284f, 12.6213f, 3.74644f, 12.0437f, 4.41629f, 11.7182f)
        lineTo(5.50816f, 11.1877f)
        curveTo(6.36203f, 10.7728f, 7.40065f, 11.0667f, 7.89181f, 11.8622f)
        lineTo(8.91348f, 13.5168f)
        curveTo(9.16562f, 13.9252f, 9.29169f, 14.1294f, 9.45347f, 14.2345f)
        curveTo(9.68102f, 14.3823f, 9.96665f, 14.4167f, 10.2241f, 14.3272f)
        curveTo(10.4072f, 14.2636f, 10.5803f, 14.0954f, 10.9264f, 13.7591f)
        curveTo(11.7417f, 12.9669f, 13.0989f, 13.0975f, 13.7384f, 14.0296f)
        lineTo(14.5397f, 15.1976f)
        curveTo(14.9857f, 15.8476f, 15.1154f, 16.6552f, 14.8945f, 17.4063f)
        lineTo(14.6604f, 18.2027f)
        curveTo(14.4494f, 18.9204f, 13.938f, 19.5191f, 13.251f, 19.853f)
        lineTo(9.41063f, 21.7189f)
        curveTo(8.50271f, 22.16f, 7.41823f, 22.0773f, 6.59222f, 21.504f)
        lineTo(3.14778f, 19.1132f)
        curveTo(2.18792f, 18.447f, 1.77447f, 17.2586f, 2.12137f, 16.1631f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 2f)
        lineTo(14f, 10f)
        }
        }.build()

        return _comet02!!
    }

private var _comet02: ImageVector? = null
