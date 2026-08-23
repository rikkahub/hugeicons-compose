package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HeartMinus: ImageVector
    get() {
        if (_heartMinus != null) {
            return _heartMinus!!
        }
        _heartMinus = ImageVector.Builder(
            name = "HeartMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14f, 15.9999f)
            horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20.802f, 12.4999f)
            curveTo(21.5335f, 11.2425f, 22f, 9.9483f, 22f, 8.69438f)
            curveTo(22f, 5.82557f, 19.8947f, 3.49994f, 17f, 3.49994f)
            curveTo(15.5f, 3.49994f, 14f, 3.99994f, 12f, 5.99994f)
            curveTo(10f, 3.99994f, 8.5f, 3.49994f, 7f, 3.49994f)
            curveTo(4.10526f, 3.49994f, 2f, 5.82557f, 2f, 8.69438f)
            curveTo(2f, 13.0348f, 7.58942f, 17.8579f, 10.4107f, 19.9676f)
            curveTo(11.3601f, 20.6776f, 12.6399f, 20.6776f, 13.5893f, 19.9676f)
            curveTo(13.7814f, 19.824f, 13.9863f, 19.6677f, 14.2015f, 19.4999f)
        }
        }.build()

        return _heartMinus!!
    }

private var _heartMinus: ImageVector? = null
