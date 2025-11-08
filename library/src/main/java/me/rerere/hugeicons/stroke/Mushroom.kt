package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mushroom: ImageVector
    get() {
        if (_mushroom != null) {
            return _mushroom!!
        }
        _mushroom = ImageVector.Builder(
            name = "Mushroom",
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
        moveTo(10.2762f, 13f)
        curveTo(12f, 16f, 8.67845f, 17.3826f, 9.02566f, 19.2747f)
        curveTo(9.43204f, 21.4891f, 11.7394f, 22.6415f, 13.4795f, 21.6298f)
        curveTo(15.9467f, 20.1953f, 14.8948f, 14.8029f, 13.9117f, 13.0196f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0153f, 2f)
        curveTo(7.3429f, 2f, 3.53836f, 4.64819f, 3.01988f, 9.03138f)
        curveTo(2.29466f, 15.1623f, 21.6547f, 13.4713f, 20.9829f, 8.81893f)
        curveTo(20.3684f, 4.56276f, 16.6118f, 2f, 12.0153f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 6f)
        curveTo(17f, 6f, 18f, 7f, 18f, 8f)
        }
        }.build()

        return _mushroom!!
    }

private var _mushroom: ImageVector? = null
