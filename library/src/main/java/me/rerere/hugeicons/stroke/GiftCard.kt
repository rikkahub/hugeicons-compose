package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = ImageVector.Builder(
            name = "GiftCard",
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
        moveTo(2f, 10f)
        curveTo(2f, 7.17157f, 2f, 5.75736f, 2.87868f, 4.87868f)
        curveTo(3.75736f, 4f, 5.17157f, 4f, 8f, 4f)
        horizontalLineTo(16f)
        curveTo(18.8284f, 4f, 20.2426f, 4f, 21.1213f, 4.87868f)
        curveTo(22f, 5.75736f, 22f, 7.17157f, 22f, 10f)
        verticalLineTo(14f)
        curveTo(22f, 16.8284f, 22f, 18.2426f, 21.1213f, 19.1213f)
        curveTo(20.2426f, 20f, 18.8284f, 20f, 16f, 20f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 20f, 3.75736f, 20f, 2.87868f, 19.1213f)
        curveTo(2f, 18.2426f, 2f, 16.8284f, 2f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 9.90429f)
        curveTo(6f, 5.35988f, 12f, 9.99015f, 12f, 13f)
        horizontalLineTo(8.5f)
        curveTo(6.7632f, 13f, 6f, 11.4699f, 6f, 9.90429f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 9.90429f)
        curveTo(18f, 5.35988f, 12f, 9.99015f, 12f, 13f)
        horizontalLineTo(15.5f)
        curveTo(17.2368f, 13f, 18f, 11.4699f, 18f, 9.90429f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 4f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 13f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 16f)
        lineTo(12f, 13f)
        lineTo(9f, 16f)
        }
        }.build()

        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
