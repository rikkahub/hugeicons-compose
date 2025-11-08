package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FingerPrintAdd: ImageVector
    get() {
        if (_fingerPrintAdd != null) {
            return _fingerPrintAdd!!
        }
        _fingerPrintAdd = ImageVector.Builder(
            name = "FingerPrintAdd",
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
        moveTo(17.5f, 16.6667f)
        verticalLineTo(18f)
        moveTo(17.5f, 18f)
        verticalLineTo(19.3333f)
        moveTo(17.5f, 18f)
        horizontalLineTo(18.8333f)
        moveTo(17.5f, 18f)
        horizontalLineTo(16.1667f)
        moveTo(21.5f, 18f)
        curveTo(21.5f, 20.2091f, 19.7091f, 22f, 17.5f, 22f)
        curveTo(15.2909f, 22f, 13.5f, 20.2091f, 13.5f, 18f)
        curveTo(13.5f, 15.7909f, 15.2909f, 14f, 17.5f, 14f)
        curveTo(19.7091f, 14f, 21.5f, 15.7909f, 21.5f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.92857f, 20.6058f)
        curveTo(3.85602f, 19.1977f, 2.5f, 16.8583f, 2.5f, 14.2103f)
        verticalLineTo(9.75757f)
        curveTo(2.5f, 8.57285f, 2.77144f, 7.44988f, 3.25704f, 6.44444f)
        moveTo(9.35714f, 21.9236f)
        curveTo(10.2589f, 22.0493f, 11.1494f, 22.0167f, 12f, 21.8493f)
        moveTo(17.7301f, 6.41803f)
        curveTo(15.636f, 2.12432f, 9.89955f, 0.664089f, 5.92857f, 3.36201f)
        moveTo(18.5f, 10.3333f)
        verticalLineTo(11.5f)
        moveTo(10.5f, 6f)
        curveTo(12.7091f, 6f, 14.5f, 7.8804f, 14.5f, 10.2f)
        moveTo(6.88493f, 8.4f)
        curveTo(6.63811f, 8.94555f, 6.5f, 9.55584f, 6.5f, 10.2f)
        verticalLineTo(13.8f)
        curveTo(6.5f, 16.1196f, 8.29086f, 18f, 10.5f, 18f)
        curveTo(10.6693f, 18f, 10.8362f, 17.989f, 11f, 17.9675f)
        moveTo(10.5f, 10.5f)
        verticalLineTo(13.5f)
        }
        }.build()

        return _fingerPrintAdd!!
    }

private var _fingerPrintAdd: ImageVector? = null
