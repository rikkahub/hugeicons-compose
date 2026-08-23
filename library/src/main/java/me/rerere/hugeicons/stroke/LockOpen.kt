package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LockOpen: ImageVector
    get() {
        if (_lockOpen != null) {
            return _lockOpen!!
        }
        _lockOpen = ImageVector.Builder(
            name = "LockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(13.4955f, 9f)
            horizontalLineTo(10.4961f)
            curveTo(8.16128f, 9f, 6.99386f, 9f, 6.11018f, 9.47237f)
            curveTo(5.41244f, 9.84535f, 4.84098f, 10.4169f, 4.46807f, 11.1146f)
            curveTo(3.99578f, 11.9984f, 3.99589f, 13.1658f, 3.9961f, 15.5006f)
            curveTo(3.99632f, 17.835f, 3.99643f, 19.0023f, 4.46877f, 19.8858f)
            curveTo(4.84172f, 20.5835f, 5.41317f, 21.1548f, 6.11085f, 21.5277f)
            curveTo(6.99445f, 22f, 8.16166f, 22f, 10.4961f, 22f)
            horizontalLineTo(13.4955f)
            curveTo(15.8301f, 22f, 16.9974f, 22f, 17.8811f, 21.5277f)
            curveTo(18.5788f, 21.1548f, 19.1503f, 20.5833f, 19.5232f, 19.8856f)
            curveTo(19.9955f, 19.0019f, 19.9955f, 17.8346f, 19.9955f, 15.5f)
            curveTo(19.9955f, 13.1654f, 19.9955f, 11.9981f, 19.5232f, 11.1144f)
            curveTo(19.1503f, 10.4167f, 18.5788f, 9.84525f, 17.8811f, 9.47231f)
            curveTo(16.9974f, 9f, 15.8301f, 9f, 13.4955f, 9f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.49609f, 9f)
            verticalLineTo(6.5f)
            curveTo(7.49609f, 4.01472f, 9.51081f, 2f, 11.9961f, 2f)
            curveTo(13.9554f, 2f, 15.3783f, 3.25221f, 15.9961f, 5f)
        }
        }.build()

        return _lockOpen!!
    }

private var _lockOpen: ImageVector? = null
