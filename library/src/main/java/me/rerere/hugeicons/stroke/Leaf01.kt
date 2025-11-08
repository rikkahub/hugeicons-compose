package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Leaf01: ImageVector
    get() {
        if (_leaf01 != null) {
            return _leaf01!!
        }
        _leaf01 = ImageVector.Builder(
            name = "Leaf01",
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
        moveTo(7.64584f, 15.7108f)
        curveTo(7.23279f, 14.8966f, 7f, 13.9755f, 7f, 13f)
        curveTo(7f, 9.78484f, 9.5f, 7.5f, 13f, 7f)
        curveTo(17.0817f, 6.4169f, 18.8333f, 4.16667f, 20f, 3f)
        curveTo(23.5f, 16f, 17f, 19f, 13f, 19f)
        curveTo(11.9071f, 19f, 10.8825f, 18.7078f, 10f, 18.1973f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        curveTo(3.5f, 18f, 5.45791f, 16.1355f, 10f, 15f)
        curveTo(13.2167f, 14.1958f, 15.4634f, 12.1791f, 17f, 10.0549f)
        }
        }.build()

        return _leaf01!!
    }

private var _leaf01: ImageVector? = null
