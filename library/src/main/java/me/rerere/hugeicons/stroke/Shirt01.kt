package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shirt01: ImageVector
    get() {
        if (_shirt01 != null) {
            return _shirt01!!
        }
        _shirt01 = ImageVector.Builder(
            name = "Shirt01",
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
        moveTo(6f, 9f)
        verticalLineTo(16.6841f)
        curveTo(6f, 18.4952f, 6f, 19.4008f, 6.58579f, 19.9635f)
        curveTo(7.89989f, 21.2257f, 15.8558f, 21.4604f, 17.4142f, 19.9635f)
        curveTo(18f, 19.4008f, 18f, 18.4952f, 18f, 16.6841f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.74073f, 12f)
        lineTo(3.04321f, 9.38915f)
        curveTo(2.34774f, 8.71602f, 2f, 8.37946f, 2f, 7.96123f)
        curveTo(2f, 7.543f, 2.34774f, 7.20644f, 3.04321f, 6.53331f)
        lineTo(5.04418f, 4.59664f)
        curveTo(5.39088f, 4.26107f, 5.56423f, 4.09329f, 5.77088f, 3.96968f)
        curveTo(5.97753f, 3.84607f, 6.21011f, 3.77103f, 6.67526f, 3.62096f)
        lineTo(8.32112f, 3.08997f)
        curveTo(8.56177f, 3.01233f, 8.68209f, 2.97351f, 8.76391f, 3.02018f)
        curveTo(8.84573f, 3.06686f, 8.87157f, 3.2013f, 8.92324f, 3.47018f)
        curveTo(9.19358f, 4.87684f, 10.4683f, 5.94185f, 12f, 5.94185f)
        curveTo(13.5317f, 5.94185f, 14.8064f, 4.87684f, 15.0768f, 3.47018f)
        curveTo(15.1284f, 3.2013f, 15.1543f, 3.06686f, 15.2361f, 3.02018f)
        curveTo(15.3179f, 2.97351f, 15.4382f, 3.01233f, 15.6789f, 3.08997f)
        lineTo(17.3247f, 3.62096f)
        curveTo(17.7899f, 3.77103f, 18.0225f, 3.84607f, 18.2291f, 3.96968f)
        curveTo(18.4358f, 4.09329f, 18.6091f, 4.26107f, 18.9558f, 4.59664f)
        lineTo(20.9568f, 6.53331f)
        curveTo(21.6523f, 7.20644f, 22f, 7.543f, 22f, 7.96123f)
        curveTo(22f, 8.37946f, 21.6523f, 8.71602f, 20.9568f, 9.38915f)
        lineTo(18.2593f, 12f)
        }
        }.build()

        return _shirt01!!
    }

private var _shirt01: ImageVector? = null
