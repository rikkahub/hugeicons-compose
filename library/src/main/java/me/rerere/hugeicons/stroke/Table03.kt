package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Table03: ImageVector
    get() {
        if (_table03 != null) {
            return _table03!!
        }
        _table03 = ImageVector.Builder(
            name = "Table03",
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
        moveTo(22f, 4f)
        lineTo(2f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 4f)
        verticalLineTo(4.65609f)
        curveTo(3f, 5.62272f, 3.228f, 6.57118f, 3.65961f, 7.40006f)
        lineTo(4.20846f, 8.45408f)
        curveTo(5.18551f, 10.3304f, 5.26288f, 12.6519f, 4.41361f, 14.609f)
        lineTo(3.29319f, 17.191f)
        curveTo(3.10038f, 17.6353f, 3f, 18.1253f, 3f, 18.6221f)
        verticalLineTo(20f)
        moveTo(21f, 4f)
        verticalLineTo(4.65609f)
        curveTo(21f, 5.62272f, 20.772f, 6.57118f, 20.3404f, 7.40006f)
        lineTo(19.7915f, 8.45408f)
        curveTo(18.8145f, 10.3304f, 18.7371f, 12.6519f, 19.5864f, 14.609f)
        lineTo(20.7068f, 17.191f)
        curveTo(20.8996f, 17.6353f, 21f, 18.1253f, 21f, 18.6221f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 15f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        curveTo(13.7549f, 7.61287f, 13.2537f, 8f, 12.7056f, 8f)
        horizontalLineTo(11.2944f)
        curveTo(10.7463f, 8f, 10.2451f, 7.61287f, 10f, 7f)
        }
        }.build()

        return _table03!!
    }

private var _table03: ImageVector? = null
