package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsSwap: ImageVector
    get() {
        if (_coinsSwap != null) {
            return _coinsSwap!!
        }
        _coinsSwap = ImageVector.Builder(
            name = "CoinsSwap",
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
        moveTo(10f, 7.0268f)
        curveTo(10.483f, 4.17323f, 12.9665f, 2f, 15.9575f, 2f)
        curveTo(19.2947f, 2f, 22f, 4.70532f, 22f, 8.0425f)
        curveTo(22f, 11.0335f, 19.8268f, 13.517f, 16.9732f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        curveTo(11.3137f, 22f, 14f, 19.3137f, 14f, 16f)
        curveTo(14f, 12.6863f, 11.3137f, 10f, 8f, 10f)
        curveTo(4.68629f, 10f, 2f, 12.6863f, 2f, 16f)
        curveTo(2f, 19.3137f, 4.68629f, 22f, 8f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        curveTo(2f, 5.68286f, 4.68286f, 3f, 8f, 3f)
        lineTo(7.14286f, 4.71429f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 15f)
        curveTo(22f, 18.3171f, 19.3171f, 21f, 16f, 21f)
        lineTo(16.8571f, 19.2857f)
        }
        }.build()

        return _coinsSwap!!
    }

private var _coinsSwap: ImageVector? = null
