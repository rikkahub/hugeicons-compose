package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Medicine01: ImageVector
    get() {
        if (_medicine01 != null) {
            return _medicine01!!
        }
        _medicine01 = ImageVector.Builder(
            name = "Medicine01",
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.3294f, 4.50042f)
        curveTo(18.7099f, 6.89148f, 17.8906f, 9.94892f, 15.4996f, 11.3294f)
        curveTo(13.1085f, 12.7099f, 10.0511f, 11.8906f, 8.6706f, 9.49958f)
        moveTo(17.3294f, 4.50042f)
        curveTo(15.9489f, 2.10935f, 12.8915f, 1.29011f, 10.5004f, 2.6706f)
        curveTo(8.10935f, 4.05108f, 7.29011f, 7.10852f, 8.6706f, 9.49958f)
        moveTo(17.3294f, 4.50042f)
        lineTo(8.6706f, 9.49958f)
        }
        }.build()

        return _medicine01!!
    }

private var _medicine01: ImageVector? = null
