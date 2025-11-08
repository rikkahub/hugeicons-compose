package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BitcoinEye: ImageVector
    get() {
        if (_bitcoinEye != null) {
            return _bitcoinEye!!
        }
        _bitcoinEye = ImageVector.Builder(
            name = "BitcoinEye",
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
        moveTo(4.75f, 2.75f)
        lineTo(7f, 5f)
        lineTo(7f, 7f)
        moveTo(19.25f, 2.75f)
        lineTo(17f, 5f)
        lineTo(17f, 7f)
        moveTo(12f, 2.75f)
        lineTo(12f, 6f)
        moveTo(4.75f, 3.5f)
        curveTo(5.16421f, 3.5f, 5.5f, 3.16421f, 5.5f, 2.75f)
        curveTo(5.5f, 2.33579f, 5.16421f, 2f, 4.75f, 2f)
        curveTo(4.33579f, 2f, 4f, 2.33579f, 4f, 2.75f)
        curveTo(4f, 3.16421f, 4.33579f, 3.5f, 4.75f, 3.5f)
        moveTo(19.25f, 3.5f)
        curveTo(18.8358f, 3.5f, 18.5f, 3.16421f, 18.5f, 2.75f)
        curveTo(18.5f, 2.33579f, 18.8358f, 2f, 19.25f, 2f)
        curveTo(19.6642f, 2f, 20f, 2.33579f, 20f, 2.75f)
        curveTo(20f, 3.16421f, 19.6642f, 3.5f, 19.25f, 3.5f)
        moveTo(12f, 3.5f)
        curveTo(12.4142f, 3.5f, 12.75f, 3.16421f, 12.75f, 2.75f)
        curveTo(12.75f, 2.33579f, 12.4142f, 2f, 12f, 2f)
        curveTo(11.5858f, 2f, 11.25f, 2.33579f, 11.25f, 2.75f)
        curveTo(11.25f, 3.16421f, 11.5858f, 3.5f, 12f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.4375f, 18.1667f)
        lineTo(10.4375f, 12.8333f)
        moveTo(12f, 12.8333f)
        verticalLineTo(11.5f)
        moveTo(12f, 19.5f)
        verticalLineTo(18.1667f)
        moveTo(10.4375f, 15.5f)
        horizontalLineTo(13.5625f)
        moveTo(13.5625f, 15.5f)
        curveTo(14.0803f, 15.5f, 14.5f, 15.9477f, 14.5f, 16.5f)
        verticalLineTo(17.1667f)
        curveTo(14.5f, 17.719f, 14.0803f, 18.1667f, 13.5625f, 18.1667f)
        horizontalLineTo(9.5f)
        moveTo(13.5625f, 15.5f)
        curveTo(14.0803f, 15.5f, 14.5f, 15.0523f, 14.5f, 14.5f)
        verticalLineTo(13.8333f)
        curveTo(14.5f, 13.281f, 14.0803f, 12.8333f, 13.5625f, 12.8333f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        curveTo(18f, 9f, 22f, 15.5f, 22f, 15.5f)
        curveTo(22f, 15.5f, 18f, 22f, 12f, 22f)
        curveTo(6f, 22f, 2f, 15.5f, 2f, 15.5f)
        curveTo(2f, 15.5f, 6f, 9f, 12f, 9f)
        }
        }.build()

        return _bitcoinEye!!
    }

private var _bitcoinEye: ImageVector? = null
