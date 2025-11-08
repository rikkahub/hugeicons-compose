package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CoinsYen: ImageVector
    get() {
        if (_coinsYen != null) {
            return _coinsYen!!
        }
        _coinsYen = ImageVector.Builder(
            name = "CoinsYen",
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
        moveTo(11.5f, 6.5f)
        curveTo(11.6667f, 7.21296f, 12.4f, 8.83333f, 14f, 9.61111f)
        moveTo(14f, 9.61111f)
        curveTo(15.6f, 8.83333f, 16.3333f, 7.21296f, 16.5f, 6.5f)
        moveTo(14f, 9.61111f)
        verticalLineTo(13.5f)
        moveTo(16.0833f, 11.1667f)
        horizontalLineTo(11.9167f)
        }
        }.build()

        return _coinsYen!!
    }

private var _coinsYen: ImageVector? = null
