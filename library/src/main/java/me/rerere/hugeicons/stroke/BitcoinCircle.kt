package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinCircle: ImageVector
    get() {
        if (_bitcoinCircle != null) {
            return _bitcoinCircle!!
        }
        _bitcoinCircle = ImageVector.Builder(
            name = "BitcoinCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
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
        curveTo(9f, 15.1751f, 9f, 15.4108f, 9.14645f, 15.5572f)
        curveTo(9.29289f, 15.7037f, 9.5286f, 15.7037f, 10f, 15.7037f)
        horizontalLineTo(13.2f)
        curveTo(14.1941f, 15.7037f, 15f, 14.8746f, 15f, 13.8518f)
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

        return _bitcoinCircle!!
    }

private var _bitcoinCircle: ImageVector? = null
