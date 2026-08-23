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

val HugeIcons.Ham: ImageVector
    get() {
        if (_ham != null) {
            return _ham!!
        }
        _ham = ImageVector.Builder(
            name = "Ham",
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
            moveTo(20.9289f, 12.4256f)
            curveTo(19.0837f, 14.2708f, 15.4938f, 13.6725f, 12.9106f, 11.0893f)
            curveTo(10.3273f, 8.50608f, 9.729f, 4.91622f, 11.5742f, 3.07109f)
            moveTo(20.9289f, 12.4256f)
            curveTo(22.7741f, 10.5805f, 22.1757f, 6.99064f, 19.5925f, 4.40745f)
            curveTo(17.0093f, 1.82427f, 13.4193f, 1.22596f, 11.5742f, 3.07109f)
            moveTo(20.9289f, 12.4256f)
            curveTo(17.2538f, 16.1006f, 10.2378f, 17.7707f, 8.2332f, 15.7662f)
            curveTo(6.22862f, 13.7616f, 7.8991f, 6.74609f, 11.5742f, 3.07109f)
            moveTo(7.23091f, 14.7646f)
            lineTo(5.22633f, 16.7692f)
            curveTo(4.48826f, 16.0311f, 3.29162f, 16.0311f, 2.55355f, 16.7692f)
            curveTo(1.81548f, 17.5072f, 1.81548f, 18.7039f, 2.55355f, 19.4419f)
            curveTo(2.95334f, 19.8417f, 3.48753f, 20.0227f, 4.01066f, 19.9894f)
            curveTo(3.97734f, 20.5125f, 4.15835f, 21.0467f, 4.55813f, 21.4465f)
            curveTo(5.2962f, 22.1845f, 6.49284f, 22.1845f, 7.23091f, 21.4465f)
            curveTo(7.96898f, 20.7084f, 7.96898f, 19.5118f, 7.23091f, 18.7737f)
            lineTo(9.2355f, 16.7692f)
            moveTo(16f, 7.5f)
            lineTo(16.5f, 8f)
            moveTo(16.9197f, 8.41764f)
            curveTo(16.7352f, 8.60215f, 16.2865f, 8.45257f, 15.9174f, 8.08355f)
            curveTo(15.5484f, 7.71452f, 15.3988f, 7.26579f, 15.5833f, 7.08128f)
            curveTo(15.7679f, 6.89676f, 16.2166f, 7.04634f, 16.5856f, 7.41537f)
            curveTo(16.9547f, 7.78439f, 17.1042f, 8.23312f, 16.9197f, 8.41764f)
            close()
        }
        }.build()

        return _ham!!
    }

private var _ham: ImageVector? = null
