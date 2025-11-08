package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = ImageVector.Builder(
            name = "Mailbox",
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
        moveTo(5.5f, 19f)
        verticalLineTo(8.5f)
        curveTo(5.5f, 4.91015f, 8.41015f, 2f, 12f, 2f)
        curveTo(15.5899f, 2f, 18.5f, 4.91015f, 18.5f, 8.5f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8688f, 22f)
        horizontalLineTo(5.13104f)
        curveTo(4.51972f, 22f, 4.21406f, 22f, 4.06951f, 21.7924f)
        curveTo(3.92497f, 21.5848f, 4.02157f, 21.2845f, 4.21477f, 20.684f)
        curveTo(4.561f, 19.6077f, 4.9089f, 19f, 6.14897f, 19f)
        horizontalLineTo(17.8508f)
        curveTo(19.0907f, 19f, 19.4386f, 19.6077f, 19.785f, 20.6838f)
        curveTo(19.9784f, 21.2844f, 20.0751f, 21.5847f, 19.9305f, 21.7924f)
        curveTo(19.786f, 22f, 19.4803f, 22f, 18.8688f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 8f)
        horizontalLineTo(19.5f)
        }
        }.build()

        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
