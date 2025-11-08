package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DeleteColumn: ImageVector
    get() {
        if (_deleteColumn != null) {
            return _deleteColumn!!
        }
        _deleteColumn = ImageVector.Builder(
            name = "DeleteColumn",
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
        moveTo(21.187f, 5.99805f)
        curveTo(20.9854f, 5.10929f, 20.6539f, 4.43424f, 20.1089f, 3.88929f)
        curveTo(18.7177f, 2.49805f, 16.4785f, 2.49805f, 12.0002f, 2.49805f)
        curveTo(7.52184f, 2.49805f, 5.28267f, 2.49805f, 3.89143f, 3.88929f)
        curveTo(2.50018f, 5.28053f, 2.50018f, 7.5197f, 2.50018f, 11.998f)
        curveTo(2.50018f, 16.4764f, 2.50018f, 18.7156f, 3.89143f, 20.1068f)
        curveTo(5.28267f, 21.498f, 7.52184f, 21.498f, 12.0002f, 21.498f)
        curveTo(16.4785f, 21.498f, 18.7177f, 21.498f, 20.1089f, 20.1068f)
        curveTo(20.6539f, 19.5619f, 20.9854f, 18.8868f, 21.187f, 17.998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 15f)
        lineTo(18.5f, 12f)
        moveTo(18.5f, 12f)
        lineTo(15.5f, 9f)
        moveTo(18.5f, 12f)
        lineTo(15.5f, 15f)
        moveTo(18.5f, 12f)
        lineTo(21.5f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 21.5f)
        lineTo(9f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 15.5f)
        lineTo(9f, 15.5f)
        moveTo(2.5f, 8.5f)
        lineTo(9f, 8.5f)
        }
        }.build()

        return _deleteColumn!!
    }

private var _deleteColumn: ImageVector? = null
