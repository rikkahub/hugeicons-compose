package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Root01: ImageVector
    get() {
        if (_root01 != null) {
            return _root01!!
        }
        _root01 = ImageVector.Builder(
            name = "Root01",
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
        moveTo(22f, 5f)
        horizontalLineTo(13.6138f)
        curveTo(12.3798f, 5f, 11.965f, 5.1398f, 11.659f, 6.36394f)
        lineTo(9.33913f, 15.6416f)
        curveTo(8.78948f, 17.8398f, 8.51466f, 18.9389f, 7.78481f, 18.9976f)
        curveTo(7.05496f, 19.0564f, 6.55032f, 18.02f, 5.54104f, 15.9472f)
        lineTo(4.97014f, 14.7748f)
        curveTo(4.53541f, 13.882f, 4.31804f, 13.4356f, 3.87855f, 13.3147f)
        curveTo(3.21709f, 13.1327f, 2.5084f, 13.6703f, 2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4004f, 11.004f)
        curveTo(15.1804f, 10.92f, 16.1337f, 11.0385f, 16.4404f, 11.64f)
        curveTo(17.0523f, 12.84f, 18.0604f, 15.36f, 18.4204f, 16.14f)
        curveTo(18.6004f, 16.44f, 18.7804f, 16.8f, 19.5004f, 16.98f)
        curveTo(19.9804f, 17.04f, 20.6039f, 16.9955f, 20.6039f, 16.9955f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.0005f, 10.998f)
        curveTo(19.5005f, 10.998f, 18.5405f, 12.66f, 17.7005f, 13.68f)
        curveTo(16.6205f, 15.24f, 15.4205f, 17.1f, 13.9805f, 16.98f)
        }
        }.build()

        return _root01!!
    }

private var _root01: ImageVector? = null
