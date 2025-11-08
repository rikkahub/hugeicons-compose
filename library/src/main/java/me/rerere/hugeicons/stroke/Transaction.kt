package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Transaction: ImageVector
    get() {
        if (_transaction != null) {
            return _transaction!!
        }
        _transaction = ImageVector.Builder(
            name = "Transaction",
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
        moveTo(4.5795f, 8.60699f)
        lineTo(2f, 8.45417f)
        curveTo(3.849f, 3.70488f, 9.15764f, 0.999849f, 14.3334f, 2.34477f)
        curveTo(19.8461f, 3.77722f, 23.1205f, 9.26153f, 21.647f, 14.5943f)
        curveTo(20.4283f, 19.0051f, 16.3433f, 21.9307f, 11.8479f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(6.5f, 22f, 2f, 17f, 2f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6039f, 9.72177f)
        curveTo(13.2524f, 9.35267f, 12.3906f, 8.48536f, 11.0292f, 9.10111f)
        curveTo(9.66784f, 9.71686f, 9.45159f, 11.698f, 11.5108f, 11.9085f)
        curveTo(12.4416f, 12.0036f, 13.0484f, 11.7981f, 13.6039f, 12.3794f)
        curveTo(14.1595f, 12.9607f, 14.2627f, 14.5774f, 12.8425f, 15.013f)
        curveTo(11.4222f, 15.4487f, 10.502f, 14.7292f, 10.2545f, 14.5041f)
        moveTo(11.9078f, 8.01953f)
        verticalLineTo(8.81056f)
        moveTo(11.9078f, 15.1471f)
        verticalLineTo(16.0195f)
        }
        }.build()

        return _transaction!!
    }

private var _transaction: ImageVector? = null
