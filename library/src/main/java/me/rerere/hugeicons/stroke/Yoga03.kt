package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Yoga03: ImageVector
    get() {
        if (_yoga03 != null) {
            return _yoga03!!
        }
        _yoga03 = ImageVector.Builder(
            name = "Yoga03",
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
        moveTo(9f, 10f)
        curveTo(9f, 13.866f, 12f, 17f, 12f, 17f)
        curveTo(12f, 17f, 15f, 13.866f, 15f, 10f)
        curveTo(15f, 6.13401f, 12f, 3f, 12f, 3f)
        curveTo(12f, 3f, 9f, 6.13401f, 9f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.33095f, 8f)
        curveTo(4.11419f, 7.04619f, 2f, 7f, 2f, 7f)
        curveTo(2f, 7f, 2.09572f, 11.3814f, 4.85714f, 14.1429f)
        curveTo(7.61857f, 16.9043f, 12f, 17f, 12f, 17f)
        curveTo(12f, 17f, 16.3814f, 16.9043f, 19.1429f, 14.1429f)
        curveTo(21.9043f, 11.3814f, 22f, 7f, 22f, 7f)
        curveTo(22f, 7f, 19.8858f, 7.04619f, 17.6691f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0207f, 17f)
        curveTo(11.8544f, 18.3333f, 12.6604f, 21f, 15.5135f, 21f)
        curveTo(17.5093f, 21f, 18.5072f, 19f, 22f, 21f)
        curveTo(21.6f, 18.9999f, 20.7998f, 17.7199f, 19.6329f, 17f)
        moveTo(11.9793f, 17f)
        curveTo(12.1456f, 18.3333f, 11.3396f, 21f, 8.48654f, 21f)
        curveTo(6.49068f, 21f, 5.49275f, 19f, 2f, 21f)
        curveTo(2.40005f, 18.9999f, 3.20018f, 17.7199f, 4.36707f, 17f)
        }
        }.build()

        return _yoga03!!
    }

private var _yoga03: ImageVector? = null
