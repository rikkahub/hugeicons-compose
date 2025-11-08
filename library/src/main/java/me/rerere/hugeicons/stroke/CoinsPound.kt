package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsPound: ImageVector
    get() {
        if (_coinsPound != null) {
            return _coinsPound!!
        }
        _coinsPound = ImageVector.Builder(
            name = "CoinsPound",
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
        moveTo(13f, 20.8434f)
        curveTo(11.8824f, 21.5748f, 10.5465f, 22f, 9.11116f, 22f)
        curveTo(5.18378f, 22f, 2f, 18.8162f, 2f, 14.8888f)
        curveTo(2f, 13.4535f, 2.42523f, 12.1176f, 3.15657f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 7.87274f)
        curveTo(15.875f, 7.04516f, 15.109f, 6.26561f, 14.0741f, 6.56561f)
        curveTo(12.9907f, 6.87966f, 12.4993f, 8.4729f, 12.9907f, 9.46841f)
        curveTo(13.5f, 10.5f, 13.7436f, 11.5f, 13.0794f, 12.9148f)
        curveTo(12.95f, 13.1904f, 12.8854f, 13.3282f, 12.921f, 13.4141f)
        curveTo(12.9567f, 13.5f, 13.0709f, 13.5f, 13.2992f, 13.5f)
        horizontalLineTo(16f)
        moveTo(12f, 10.1667f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _coinsPound!!
    }

private var _coinsPound: ImageVector? = null
