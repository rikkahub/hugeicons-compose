package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cashback: ImageVector
    get() {
        if (_cashback != null) {
            return _cashback!!
        }
        _cashback = ImageVector.Builder(
            name = "Cashback",
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
        moveTo(2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(7.89936f, 2f, 4.3752f, 4.46819f, 2.83209f, 8f)
        moveTo(2f, 4.5f)
        lineTo(2.5f, 8.5f)
        lineTo(6.5f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.7257f, 10.0603f)
        curveTo(14.6268f, 9.29765f, 13.7528f, 8.06543f, 12.1812f, 8.0654f)
        curveTo(10.3551f, 8.06537f, 9.58672f, 9.07867f, 9.43081f, 9.58532f)
        curveTo(9.18758f, 10.263f, 9.23622f, 11.6563f, 11.3766f, 11.8082f)
        curveTo(14.0522f, 11.9982f, 15.124f, 12.3146f, 14.9877f, 13.9552f)
        curveTo(14.8513f, 15.5957f, 13.3599f, 15.9502f, 12.1812f, 15.9121f)
        curveTo(11.0024f, 15.8742f, 9.07398f, 15.3317f, 8.99915f, 13.8725f)
        moveTo(11.9941f, 6.49921f)
        verticalLineTo(8.06902f)
        moveTo(11.9941f, 15.9023f)
        verticalLineTo(17.4992f)
        }
        }.build()

        return _cashback!!
    }

private var _cashback: ImageVector? = null
