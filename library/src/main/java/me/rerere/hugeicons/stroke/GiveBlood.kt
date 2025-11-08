package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GiveBlood: ImageVector
    get() {
        if (_giveBlood != null) {
            return _giveBlood!!
        }
        _giveBlood = ImageVector.Builder(
            name = "GiveBlood",
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
        moveTo(9f, 7.54707f)
        curveTo(9f, 5.55959f, 10.6851f, 3.59556f, 11.8678f, 2.46181f)
        curveTo(12.5102f, 1.84606f, 13.4898f, 1.84606f, 14.1322f, 2.46181f)
        curveTo(15.3149f, 3.59556f, 17f, 5.55959f, 17f, 7.54707f)
        curveTo(17f, 9.4957f, 15.4853f, 11.5f, 13f, 11.5f)
        curveTo(10.5147f, 11.5f, 9f, 9.4957f, 9f, 7.54707f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14f)
        horizontalLineTo(6.39482f)
        curveTo(6.68897f, 14f, 6.97908f, 14.0663f, 7.24217f, 14.1936f)
        lineTo(9.28415f, 15.1816f)
        curveTo(9.54724f, 15.3089f, 9.83735f, 15.3751f, 10.1315f, 15.3751f)
        horizontalLineTo(11.1741f)
        curveTo(12.1825f, 15.3751f, 13f, 16.1662f, 13f, 17.142f)
        curveTo(13f, 17.1814f, 12.973f, 17.2161f, 12.9338f, 17.2269f)
        lineTo(10.3929f, 17.9295f)
        curveTo(9.93707f, 18.0555f, 9.449f, 18.0116f, 9.025f, 17.8064f)
        lineTo(6.84211f, 16.7503f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16.5f)
        lineTo(17.5928f, 15.0889f)
        curveTo(18.407f, 14.8352f, 19.2871f, 15.136f, 19.7971f, 15.8423f)
        curveTo(20.1659f, 16.3529f, 20.0157f, 17.0842f, 19.4785f, 17.3942f)
        lineTo(11.9629f, 21.7305f)
        curveTo(11.4849f, 22.0063f, 10.9209f, 22.0736f, 10.3952f, 21.9176f)
        lineTo(4f, 20.0199f)
        }
        }.build()

        return _giveBlood!!
    }

private var _giveBlood: ImageVector? = null
