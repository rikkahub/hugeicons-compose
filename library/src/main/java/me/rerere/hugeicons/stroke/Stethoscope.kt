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

val HugeIcons.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = ImageVector.Builder(
            name = "Stethoscope",
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
            moveTo(13.0014f, 2f)
            curveTo(14.1053f, 2f, 15.0003f, 2.93126f, 15.0003f, 4.08003f)
            curveTo(15.0003f, 5.02915f, 15.0362f, 5.87375f, 14.2692f, 6.57196f)
            curveTo(11.7587f, 8.85732f, 10.5034f, 10f, 9.00027f, 10f)
            curveTo(7.49714f, 10f, 6.24187f, 8.85732f, 3.73133f, 6.57196f)
            curveTo(2.96426f, 5.87369f, 3.00027f, 5.029f, 3.00027f, 4.07981f)
            curveTo(3.00027f, 2.93116f, 3.8951f, 2f, 4.99893f, 2f)
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
            moveTo(9f, 14f)
            verticalLineTo(17.4998f)
            curveTo(9f, 19.9852f, 11.0149f, 22.0001f, 13.5003f, 22.0001f)
            curveTo(15.9858f, 22.0001f, 18.0007f, 19.9852f, 18.0007f, 17.4998f)
            verticalLineTo(16f)
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
            moveTo(14f, 7f)
            lineTo(12.6978f, 10.2556f)
            curveTo(12.3516f, 11.121f, 12.1785f, 11.5537f, 11.8887f, 11.9092f)
            curveTo(11.5988f, 12.2648f, 11.2098f, 12.5215f, 10.4319f, 13.0349f)
            lineTo(8.9696f, 14f)
            lineTo(7.53283f, 13.0323f)
            curveTo(6.77221f, 12.5201f, 6.39189f, 12.2639f, 6.10821f, 11.9126f)
            curveTo(5.82452f, 11.5613f, 5.65423f, 11.1356f, 5.31365f, 10.2841f)
            lineTo(4f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 13f)
            curveTo(21f, 14.6569f, 19.6569f, 16f, 18f, 16f)
            curveTo(16.3431f, 16f, 15f, 14.6569f, 15f, 13f)
            curveTo(15f, 11.3431f, 16.3431f, 10f, 18f, 10f)
            curveTo(19.6569f, 10f, 21f, 11.3431f, 21f, 13f)
            close()
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
            moveTo(18.125f, 13f)
            horizontalLineTo(18f)
            moveTo(18.25f, 13f)
            curveTo(18.25f, 13.1381f, 18.1381f, 13.25f, 18f, 13.25f)
            curveTo(17.8619f, 13.25f, 17.75f, 13.1381f, 17.75f, 13f)
            curveTo(17.75f, 12.8619f, 17.8619f, 12.75f, 18f, 12.75f)
            curveTo(18.1381f, 12.75f, 18.25f, 12.8619f, 18.25f, 13f)
            close()
        }
        }.build()

        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
