package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NutOff: ImageVector
    get() {
        if (_nutOff != null) {
            return _nutOff!!
        }
        _nutOff = ImageVector.Builder(
            name = "NutOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.01157f, 7.01147f)
            curveTo(4.59766f, 8.35216f, 2.30645f, 10.4949f, 2.05453f, 12.9515f)
            curveTo(1.67875f, 16.6161f, 3.39301f, 18.293f, 2.70241f, 20.2975f)
            curveTo(4.70687f, 19.6069f, 6.38382f, 21.3212f, 10.0484f, 20.9454f)
            curveTo(12.505f, 20.6935f, 14.6478f, 18.4022f, 15.9884f, 15.9883f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 4.50589f)
            curveTo(21.3879f, 4.00538f, 19.5f, 3.5f, 17.2591f, 5.13655f)
            moveTo(9.20221f, 4.20221f)
            curveTo(9.28486f, 4.05849f, 9.38944f, 3.9244f, 9.50947f, 3.80438f)
            curveTo(9.57693f, 3.73692f, 9.64738f, 3.67365f, 9.72794f, 3.62254f)
            curveTo(10.8062f, 2.93847f, 14.2401f, 2.10551f, 17.5673f, 5.43273f)
            curveTo(20.8945f, 8.75994f, 20.0615f, 12.1938f, 19.3775f, 13.2721f)
            curveTo(19.3264f, 13.3526f, 19.2631f, 13.4231f, 19.1956f, 13.4905f)
            curveTo(19.0756f, 13.6106f, 18.9415f, 13.7151f, 18.7978f, 13.7978f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _nutOff!!
    }

private var _nutOff: ImageVector? = null
