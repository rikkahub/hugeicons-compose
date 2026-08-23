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

val HugeIcons.HeartOff: ImageVector
    get() {
        if (_heartOff != null) {
            return _heartOff!!
        }
        _heartOff = ImageVector.Builder(
            name = "HeartOff",
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(19.7997f, 14.5f)
            curveTo(21.0808f, 12.7942f, 22f, 10.9546f, 22f, 9.19444f)
            curveTo(22f, 6.32563f, 19.8947f, 4f, 17f, 4f)
            curveTo(15.5f, 4f, 14f, 4.5f, 12f, 6.5f)
            curveTo(11.0765f, 5.57646f, 10.2595f, 4.97277f, 9.5f, 4.59046f)
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
            moveTo(17f, 17.5947f)
            curveTo(15.7619f, 18.7727f, 14.5238f, 19.7692f, 13.5893f, 20.4679f)
            curveTo(12.6399f, 21.1779f, 11.3601f, 21.1779f, 10.4107f, 20.4679f)
            curveTo(7.58942f, 18.3582f, 2f, 13.5351f, 2f, 9.19469f)
            curveTo(2f, 7.24674f, 2.97064f, 5.54922f, 4.5f, 4.66016f)
        }
        }.build()

        return _heartOff!!
    }

private var _heartOff: ImageVector? = null
