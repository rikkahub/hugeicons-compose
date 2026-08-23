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

val HugeIcons.Dam: ImageVector
    get() {
        if (_dam != null) {
            return _dam!!
        }
        _dam = ImageVector.Builder(
            name = "Dam",
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
            moveTo(7.81459f, 17.5873f)
            lineTo(6.10679f, 4.84407f)
            curveTo(6.03723f, 4.32498f, 6.00244f, 4.06544f, 5.90718f, 3.85727f)
            curveTo(5.73457f, 3.48004f, 5.41807f, 3.19444f, 5.0338f, 3.06915f)
            curveTo(4.82173f, 3f, 4.56889f, 3f, 4.0632f, 3f)
            curveTo(3.48991f, 3f, 3.20326f, 3f, 2.97265f, 3.08298f)
            curveTo(2.55422f, 3.23354f, 2.22534f, 3.57437f, 2.08007f, 4.00802f)
            curveTo(2f, 4.24701f, 2f, 4.54408f, 2f, 5.13823f)
            verticalLineTo(18f)
            curveTo(2f, 19.4142f, 2f, 20.1213f, 2.42393f, 20.5607f)
            curveTo(2.84785f, 21f, 3.53831f, 21f, 4.91924f, 21f)
            curveTo(6.48545f, 21f, 7.26855f, 21f, 7.70123f, 20.485f)
            curveTo(8.13391f, 19.97f, 8.02747f, 19.1758f, 7.81459f, 17.5873f)
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
            moveTo(22f, 12f)
            curveTo(21.4f, 11.5f, 20.8f, 11f, 19.5f, 11f)
            curveTo(17f, 11f, 17f, 13f, 14.5f, 13f)
            curveTo(11.9f, 13f, 12.1f, 11f, 9.5f, 11f)
            curveTo(8.57595f, 11f, 7.99344f, 11.2732f, 7.5f, 11.6177f)
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
            moveTo(22f, 18f)
            curveTo(21.4f, 17.5f, 20.8f, 17f, 19.5f, 17f)
            curveTo(17f, 17f, 17f, 19f, 14.5f, 19f)
            curveTo(11.9f, 19f, 12.1f, 17f, 9.5f, 17f)
            curveTo(8.86664f, 17f, 8.39374f, 17.1284f, 8f, 17.3201f)
        }
        }.build()

        return _dam!!
    }

private var _dam: ImageVector? = null
