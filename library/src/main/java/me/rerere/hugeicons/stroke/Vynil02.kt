package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vynil02: ImageVector
    get() {
        if (_vynil02 != null) {
            return _vynil02!!
        }
        _vynil02 = ImageVector.Builder(
            name = "Vynil02",
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
        moveTo(21.5f, 12.5f)
        curveTo(21.5f, 18.0228f, 17.0228f, 22.5f, 11.5f, 22.5f)
        curveTo(5.97715f, 22.5f, 1.5f, 18.0228f, 1.5f, 12.5f)
        curveTo(1.5f, 6.97715f, 5.97715f, 2.5f, 11.5f, 2.5f)
        curveTo(12.6688f, 2.5f, 13.7907f, 2.70051f, 14.8333f, 3.06902f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 9f)
        curveTo(19.5f, 10.3807f, 18.3807f, 11.5f, 17f, 11.5f)
        curveTo(15.6193f, 11.5f, 14.5f, 10.3807f, 14.5f, 9f)
        curveTo(14.5f, 7.61929f, 15.6193f, 6.5f, 17f, 6.5f)
        curveTo(18.3807f, 6.5f, 19.5f, 7.61929f, 19.5f, 9f)
        moveTo(19.5f, 9f)
        verticalLineTo(1.5f)
        curveTo(19.8333f, 2f, 20.1f, 4.1f, 22.5f, 4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12.5f)
        curveTo(13f, 11.6716f, 12.3284f, 11f, 11.5f, 11f)
        curveTo(10.6716f, 11f, 10f, 11.6716f, 10f, 12.5f)
        curveTo(10f, 13.3284f, 10.6716f, 14f, 11.5f, 14f)
        curveTo(12.3284f, 14f, 13f, 13.3284f, 13f, 12.5f)
        }
        }.build()

        return _vynil02!!
    }

private var _vynil02: ImageVector? = null
