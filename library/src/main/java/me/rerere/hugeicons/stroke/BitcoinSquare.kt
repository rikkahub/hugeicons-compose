package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinSquare: ImageVector
    get() {
        if (_bitcoinSquare != null) {
            return _bitcoinSquare!!
        }
        _bitcoinSquare = ImageVector.Builder(
            name = "BitcoinSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        horizontalLineTo(13.2f)
        moveTo(9f, 12f)
        verticalLineTo(9.2963f)
        curveTo(9f, 8.82489f, 9f, 8.58919f, 9.14645f, 8.44274f)
        curveTo(9.29289f, 8.2963f, 9.5286f, 8.2963f, 10f, 8.2963f)
        horizontalLineTo(13.2f)
        curveTo(14.1941f, 8.2963f, 15f, 9.1254f, 15f, 10.1481f)
        curveTo(15f, 11.1709f, 14.1941f, 12f, 13.2f, 12f)
        moveTo(9f, 12f)
        verticalLineTo(14.7037f)
        curveTo(9f, 15.1751f, 9f, 15.4108f, 9.14645f, 15.5573f)
        curveTo(9.29289f, 15.7037f, 9.5286f, 15.7037f, 10f, 15.7037f)
        horizontalLineTo(13.2f)
        curveTo(14.1941f, 15.7037f, 15f, 14.8746f, 15f, 13.8519f)
        curveTo(15f, 12.8291f, 14.1941f, 12f, 13.2f, 12f)
        moveTo(10.4938f, 8.2963f)
        verticalLineTo(7f)
        moveTo(10.4938f, 17f)
        verticalLineTo(15.7037f)
        moveTo(12.8982f, 8.2963f)
        verticalLineTo(7f)
        moveTo(12.8982f, 17f)
        verticalLineTo(15.7037f)
        }
        }.build()

        return _bitcoinSquare!!
    }

private var _bitcoinSquare: ImageVector? = null
