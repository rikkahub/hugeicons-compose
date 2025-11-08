package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HeartCheck: ImageVector
    get() {
        if (_heartCheck != null) {
            return _heartCheck!!
        }
        _heartCheck = ImageVector.Builder(
            name = "HeartCheck",
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
        moveTo(13f, 20.3025f)
        curveTo(12.1525f, 20.6505f, 11.1746f, 20.5389f, 10.4107f, 19.9677f)
        curveTo(7.58942f, 17.858f, 2f, 13.0348f, 2f, 8.69444f)
        curveTo(2f, 5.82563f, 4.10526f, 3.5f, 7f, 3.5f)
        curveTo(8.5f, 3.5f, 10f, 4f, 12f, 6f)
        curveTo(14f, 4f, 15.5f, 3.5f, 17f, 3.5f)
        curveTo(19.8947f, 3.5f, 22f, 5.82563f, 22f, 8.69444f)
        curveTo(22f, 9.12591f, 21.9448f, 9.56214f, 21.8425f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        curveTo(14f, 17f, 15f, 17f, 16f, 19f)
        curveTo(16f, 19f, 19.1765f, 14f, 22f, 13f)
        }
        }.build()

        return _heartCheck!!
    }

private var _heartCheck: ImageVector? = null
