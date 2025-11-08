package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DocumentCode: ImageVector
    get() {
        if (_documentCode != null) {
            return _documentCode!!
        }
        _documentCode = ImageVector.Builder(
            name = "DocumentCode",
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
        moveTo(18f, 16f)
        lineTo(19.8398f, 17.5858f)
        curveTo(20.6133f, 18.2525f, 21f, 18.5858f, 21f, 19f)
        curveTo(21f, 19.4142f, 20.6133f, 19.7475f, 19.8398f, 20.4142f)
        lineTo(18f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 16f)
        lineTo(12.1602f, 17.5858f)
        curveTo(11.3867f, 18.2525f, 11f, 18.5858f, 11f, 19f)
        curveTo(11f, 19.4142f, 11.3867f, 19.7475f, 12.1602f, 20.4142f)
        lineTo(14f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13.0032f)
        lineTo(20f, 7.8199f)
        curveTo(20f, 6.12616f, 20f, 5.27929f, 19.732f, 4.60291f)
        curveTo(19.3013f, 3.51555f, 18.3902f, 2.65784f, 17.2352f, 2.25228f)
        curveTo(16.5168f, 2f, 15.6173f, 2f, 13.8182f, 2f)
        curveTo(10.6698f, 2f, 9.09563f, 2f, 7.83836f, 2.44148f)
        curveTo(5.81714f, 3.15122f, 4.22281f, 4.6522f, 3.46894f, 6.55509f)
        curveTo(3f, 7.73875f, 3f, 9.22077f, 3f, 12.1848f)
        lineTo(3f, 14.731f)
        curveTo(3f, 17.8013f, 3f, 19.3364f, 3.8477f, 20.4025f)
        curveTo(4.09058f, 20.708f, 4.37862f, 20.9792f, 4.70307f, 21.2078f)
        curveTo(5.61506f, 21.8506f, 6.85019f, 21.9757f, 9f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 12f)
        curveTo(3f, 10.159f, 4.49238f, 8.66667f, 6.33333f, 8.66667f)
        curveTo(6.99912f, 8.66667f, 7.78404f, 8.78333f, 8.43137f, 8.60988f)
        curveTo(9.00652f, 8.45576f, 9.45576f, 8.00652f, 9.60988f, 7.43136f)
        curveTo(9.78333f, 6.78404f, 9.66667f, 5.99912f, 9.66667f, 5.33333f)
        curveTo(9.66667f, 3.49238f, 11.1591f, 2f, 13f, 2f)
        }
        }.build()

        return _documentCode!!
    }

private var _documentCode: ImageVector? = null
