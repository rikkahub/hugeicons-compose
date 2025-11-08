package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SaveMoneyEuro: ImageVector
    get() {
        if (_saveMoneyEuro != null) {
            return _saveMoneyEuro!!
        }
        _saveMoneyEuro = ImageVector.Builder(
            name = "SaveMoneyEuro",
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
        moveTo(19.7453f, 13f)
        curveTo(20.5362f, 11.8662f, 21f, 10.4872f, 21f, 9f)
        curveTo(21f, 5.13401f, 17.866f, 2f, 14f, 2f)
        curveTo(10.134f, 2f, 7f, 5.134f, 7f, 9f)
        curveTo(7f, 10.0736f, 7.24169f, 11.0907f, 7.67363f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 11.1807f)
        curveTo(15.6014f, 11.9713f, 14.876f, 12.5f, 14.0473f, 12.5f)
        curveTo(12.7892f, 12.5f, 11.7692f, 11.2812f, 11.7692f, 9.77778f)
        verticalLineTo(8.22222f)
        curveTo(11.7692f, 6.71878f, 12.7892f, 5.5f, 14.0473f, 5.5f)
        curveTo(14.876f, 5.5f, 15.6014f, 6.02873f, 16f, 6.81927f)
        moveTo(10.5f, 9f)
        horizontalLineTo(14.2692f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 14f)
        horizontalLineTo(5.39482f)
        curveTo(5.68897f, 14f, 5.97908f, 14.0663f, 6.24217f, 14.1936f)
        lineTo(8.28415f, 15.1816f)
        curveTo(8.54724f, 15.3089f, 8.83735f, 15.3751f, 9.1315f, 15.3751f)
        horizontalLineTo(10.1741f)
        curveTo(11.1825f, 15.3751f, 12f, 16.1662f, 12f, 17.142f)
        curveTo(12f, 17.1814f, 11.973f, 17.2161f, 11.9338f, 17.2269f)
        lineTo(9.39287f, 17.9295f)
        curveTo(8.93707f, 18.0555f, 8.449f, 18.0116f, 8.025f, 17.8064f)
        lineTo(5.84211f, 16.7503f)
        moveTo(12f, 16.5f)
        lineTo(16.5928f, 15.0889f)
        curveTo(17.407f, 14.8352f, 18.2871f, 15.136f, 18.7971f, 15.8423f)
        curveTo(19.1659f, 16.3529f, 19.0157f, 17.0842f, 18.4785f, 17.3942f)
        lineTo(10.9629f, 21.7305f)
        curveTo(10.4849f, 22.0063f, 9.92094f, 22.0736f, 9.39516f, 21.9176f)
        lineTo(3f, 20.0199f)
        }
        }.build()

        return _saveMoneyEuro!!
    }

private var _saveMoneyEuro: ImageVector? = null
