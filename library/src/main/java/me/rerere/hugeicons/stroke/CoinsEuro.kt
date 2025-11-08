package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsEuro: ImageVector
    get() {
        if (_coinsEuro != null) {
            return _coinsEuro!!
        }
        _coinsEuro = ImageVector.Builder(
            name = "CoinsEuro",
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
        moveTo(14f, 18f)
        curveTo(18.4183f, 18f, 22f, 14.4183f, 22f, 10f)
        curveTo(22f, 5.58172f, 18.4183f, 2f, 14f, 2f)
        curveTo(9.58172f, 2f, 6f, 5.58172f, 6f, 10f)
        curveTo(6f, 14.4183f, 9.58172f, 18f, 14f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.15657f, 11f)
        curveTo(2.42523f, 12.1176f, 2f, 13.4535f, 2f, 14.8888f)
        curveTo(2f, 18.8162f, 5.18378f, 22f, 9.11116f, 22f)
        curveTo(10.5465f, 22f, 11.8824f, 21.5748f, 13f, 20.8434f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 12.4923f)
        curveTo(16.5216f, 13.3957f, 15.6512f, 14f, 14.6568f, 14f)
        curveTo(13.147f, 14f, 11.9231f, 12.6071f, 11.9231f, 10.8889f)
        verticalLineTo(9.11111f)
        curveTo(11.9231f, 7.39289f, 13.147f, 6f, 14.6568f, 6f)
        curveTo(15.6512f, 6f, 16.5216f, 6.60426f, 17f, 7.50774f)
        moveTo(11f, 10f)
        horizontalLineTo(14.9231f)
        }
        }.build()

        return _coinsEuro!!
    }

private var _coinsEuro: ImageVector? = null
