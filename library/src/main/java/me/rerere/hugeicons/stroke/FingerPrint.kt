package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FingerPrint: ImageVector
    get() {
        if (_fingerPrint != null) {
            return _fingerPrint!!
        }
        _fingerPrint = ImageVector.Builder(
            name = "FingerPrint",
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
        moveTo(7.42857f, 3.36201f)
        curveTo(11.3996f, 0.664089f, 17.136f, 2.12432f, 19.2301f, 6.41803f)
        moveTo(10.8571f, 21.9236f)
        curveTo(15.5839f, 22.5822f, 20f, 18.8952f, 20f, 14.2103f)
        verticalLineTo(10.3333f)
        moveTo(7.42857f, 20.6058f)
        curveTo(5.35602f, 19.1977f, 4f, 16.8583f, 4f, 14.2103f)
        verticalLineTo(9.75757f)
        curveTo(4f, 8.57285f, 4.27144f, 7.44988f, 4.75704f, 6.44444f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13.8f)
        curveTo(16f, 16.1196f, 14.2091f, 18f, 12f, 18f)
        curveTo(9.79086f, 18f, 8f, 16.1196f, 8f, 13.8f)
        verticalLineTo(10.2f)
        curveTo(8f, 9.55584f, 8.13811f, 8.94555f, 8.38493f, 8.4f)
        moveTo(12f, 6f)
        curveTo(14.2091f, 6f, 16f, 7.8804f, 16f, 10.2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10.5f)
        lineTo(12f, 13.5f)
        }
        }.build()

        return _fingerPrint!!
    }

private var _fingerPrint: ImageVector? = null
