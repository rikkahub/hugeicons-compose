package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ExchangeDollar: ImageVector
    get() {
        if (_exchangeDollar != null) {
            return _exchangeDollar!!
        }
        _exchangeDollar = ImageVector.Builder(
            name = "ExchangeDollar",
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
        moveTo(15f, 8f)
        horizontalLineTo(11f)
        curveTo(9.89543f, 8f, 9f, 8.89543f, 9f, 10f)
        curveTo(9f, 11.1046f, 9.89543f, 12f, 11f, 12f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 12f, 15f, 12.8954f, 15f, 14f)
        curveTo(15f, 15.1046f, 14.1046f, 16f, 13f, 16f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 6f)
        lineTo(12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        verticalLineTo(7f)
        curveTo(6f, 5.58579f, 6f, 4.87868f, 5.56066f, 4.43934f)
        curveTo(5.12132f, 4f, 4.41421f, 4f, 3f, 4f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 16f)
        verticalLineTo(17f)
        curveTo(18f, 18.4142f, 18f, 19.1213f, 18.4393f, 19.5607f)
        curveTo(18.8787f, 20f, 19.5858f, 20f, 21f, 20f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 2.20004f)
        curveTo(10.6462f, 2.06886f, 11.3151f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 14.7255f, 20.9097f, 17.1962f, 19.1414f, 19f)
        moveTo(14f, 21.8f)
        curveTo(13.3538f, 21.9311f, 12.6849f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 9.20261f, 3.14864f, 6.67349f, 5f, 4.85857f)
        }
        }.build()

        return _exchangeDollar!!
    }

private var _exchangeDollar: ImageVector? = null
