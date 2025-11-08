package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RunningShoes: ImageVector
    get() {
        if (_runningShoes != null) {
            return _runningShoes!!
        }
        _runningShoes = ImageVector.Builder(
            name = "RunningShoes",
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
        moveTo(19.1012f, 18f)
        horizontalLineTo(7.96299f)
        curveTo(5.02913f, 18f, 3.56221f, 18f, 2.66807f, 16.8828f)
        curveTo(0.97093f, 14.7623f, 2.9047f, 9.1238f, 4.07611f, 7f)
        curveTo(4.47324f, 9.4f, 8.56152f, 9.33333f, 10.0507f, 9f)
        curveTo(9.05852f, 7.00119f, 10.3831f, 6.33413f, 11.0453f, 6.00059f)
        lineTo(11.0465f, 6f)
        curveTo(14f, 9.5f, 20.3149f, 11.404f, 21.8624f, 15.2188f)
        curveTo(22.5309f, 16.8667f, 20.6262f, 18f, 19.1012f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        curveTo(6.16467f, 15.4294f, 8.73097f, 15.8442f, 12.0217f, 14.8039f)
        curveTo(13.0188f, 14.4887f, 13.5174f, 14.3311f, 13.8281f, 14.3525f)
        curveTo(14.1389f, 14.3739f, 14.7729f, 14.6695f, 16.0408f, 15.2608f)
        curveTo(17.6243f, 15.9992f, 19.7971f, 16.4243f, 22f, 15.3583f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 9.5f)
        lineTo(15f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 11f)
        lineTo(17f, 9.5f)
        }
        }.build()

        return _runningShoes!!
    }

private var _runningShoes: ImageVector? = null
