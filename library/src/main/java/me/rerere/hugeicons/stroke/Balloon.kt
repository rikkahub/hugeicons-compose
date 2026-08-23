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

val HugeIcons.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = ImageVector.Builder(
            name = "Balloon",
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
            moveTo(12f, 17f)
            curveTo(14f, 17f, 18f, 12.5f, 18f, 8f)
            curveTo(18f, 4.68629f, 15.3137f, 2f, 12f, 2f)
            curveTo(8.68629f, 2f, 6f, 4.68629f, 6f, 8f)
            curveTo(6f, 12.5f, 10f, 17f, 12f, 17f)
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
            moveTo(14f, 8f)
            curveTo(14f, 6.89543f, 13.1046f, 6f, 12f, 6f)
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
            moveTo(12f, 17f)
            verticalLineTo(17.3229f)
            curveTo(12f, 17.749f, 12f, 17.9621f, 11.9611f, 18.1564f)
            curveTo(11.867f, 18.6269f, 11.6068f, 19.0479f, 11.228f, 19.3425f)
            curveTo(11.0716f, 19.4642f, 10.8811f, 19.5595f, 10.5f, 19.75f)
            lineTo(10.3416f, 19.8292f)
            curveTo(10.1137f, 19.9431f, 9.99973f, 20.0001f, 9.90086f, 20.0652f)
            curveTo(9.40808f, 20.3893f, 9.08351f, 20.9145f, 9.01396f, 21.5002f)
            curveTo(9f, 21.6177f, 9f, 21.7452f, 9f, 22f)
        }
        }.build()

        return _balloon!!
    }

private var _balloon: ImageVector? = null
