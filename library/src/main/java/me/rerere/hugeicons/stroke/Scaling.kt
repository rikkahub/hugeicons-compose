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

val HugeIcons.Scaling: ImageVector
    get() {
        if (_scaling != null) {
            return _scaling!!
        }
        _scaling = ImageVector.Builder(
            name = "Scaling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = SolidColor(Color(0xFF141B34)),
            stroke = null,
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.96186f, 14.9697f)
            curveTo(7.66896f, 15.2626f, 7.66896f, 15.7374f, 7.96186f, 16.0303f)
            curveTo(8.25475f, 16.3232f, 8.72962f, 16.3232f, 9.02252f, 16.0303f)
            lineTo(8.49219f, 15.5f)
            lineTo(7.96186f, 14.9697f)
            close()
            moveTo(21.0225f, 4.03033f)
            curveTo(21.3154f, 3.73744f, 21.3154f, 3.26256f, 21.0225f, 2.96967f)
            curveTo(20.7296f, 2.67678f, 20.2548f, 2.67678f, 19.9619f, 2.96967f)
            lineTo(20.4922f, 3.5f)
            lineTo(21.0225f, 4.03033f)
            close()
            moveTo(8.49219f, 15.5f)
            lineTo(9.02252f, 16.0303f)
            lineTo(21.0225f, 4.03033f)
            lineTo(20.4922f, 3.5f)
            lineTo(19.9619f, 2.96967f)
            lineTo(7.96186f, 14.9697f)
            lineTo(8.49219f, 15.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21.4915f, 13.0003f)
            curveTo(21.4839f, 16.8201f, 21.3845f, 18.8255f, 20.1009f, 20.1091f)
            curveTo(18.7097f, 21.5003f, 16.4705f, 21.5003f, 11.9922f, 21.5003f)
            curveTo(7.51384f, 21.5003f, 5.27467f, 21.5003f, 3.88343f, 20.1091f)
            curveTo(2.49219f, 18.7178f, 2.49219f, 16.4787f, 2.49219f, 12.0003f)
            curveTo(2.49219f, 7.52199f, 2.49219f, 5.28282f, 3.88343f, 3.89157f)
            curveTo(5.16702f, 2.60798f, 7.1724f, 2.50866f, 10.9922f, 2.50098f)
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
            moveTo(8.0983f, 10f)
            curveTo(8.0983f, 10f, 7.71519f, 14.8976f, 8.40487f, 15.5873f)
            curveTo(9.09454f, 16.277f, 13.9922f, 15.8939f, 13.9922f, 15.8939f)
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
            moveTo(21.3861f, 8.5f)
            curveTo(21.3861f, 8.5f, 21.7692f, 3.60235f, 21.0795f, 2.91266f)
            curveTo(20.3898f, 2.22298f, 15.4922f, 2.60614f, 15.4922f, 2.60614f)
        }
        }.build()

        return _scaling!!
    }

private var _scaling: ImageVector? = null
