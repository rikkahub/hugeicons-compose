package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CashbackBitcoin: ImageVector
    get() {
        if (_cashbackBitcoin != null) {
            return _cashbackBitcoin!!
        }
        _cashbackBitcoin = ImageVector.Builder(
            name = "CashbackBitcoin",
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
        moveTo(2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
        moveTo(2f, 4.5f)
        lineTo(2.5f, 8.5f)
        lineTo(6.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 12f)
        horizontalLineTo(14.25f)
        curveTo(15.2165f, 12f, 16f, 12.7835f, 16f, 13.75f)
        curveTo(16f, 14.7165f, 15.2165f, 15.5f, 14.25f, 15.5f)
        horizontalLineTo(10.5f)
        moveTo(10.5f, 12f)
        verticalLineTo(15.5f)
        moveTo(10.5f, 12f)
        horizontalLineTo(13.75f)
        curveTo(14.7165f, 12f, 15.5f, 11.2165f, 15.5f, 10.25f)
        curveTo(15.5f, 9.2835f, 14.7165f, 8.5f, 13.75f, 8.5f)
        horizontalLineTo(10.5f)
        moveTo(10.5f, 12f)
        verticalLineTo(8.5f)
        moveTo(10.5f, 15.5f)
        horizontalLineTo(9f)
        moveTo(10.5f, 15.5f)
        verticalLineTo(17f)
        moveTo(10.5f, 8.5f)
        horizontalLineTo(9f)
        moveTo(10.5f, 8.5f)
        verticalLineTo(7f)
        moveTo(13.5f, 8.5f)
        verticalLineTo(7f)
        moveTo(13.5f, 15.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _cashbackBitcoin!!
    }

private var _cashbackBitcoin: ImageVector? = null
