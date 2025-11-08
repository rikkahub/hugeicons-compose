package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PayByCheck: ImageVector
    get() {
        if (_payByCheck != null) {
            return _payByCheck!!
        }
        _payByCheck = ImageVector.Builder(
            name = "PayByCheck",
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
        moveTo(7f, 11f)
        horizontalLineTo(6f)
        curveTo(2.69067f, 11f, 2f, 11.6907f, 2f, 15f)
        verticalLineTo(18f)
        curveTo(2f, 21.3093f, 2.69067f, 22f, 6f, 22f)
        horizontalLineTo(18f)
        curveTo(21.3093f, 22f, 22f, 21.3093f, 22f, 18f)
        verticalLineTo(15f)
        curveTo(22f, 12.7889f, 21.6917f, 11.7468f, 20.5f, 11.2987f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        lineTo(18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2442f, 3.13291f)
        curveTo(17.6913f, 2.64778f, 17.9149f, 2.40522f, 18.1524f, 2.26374f)
        curveTo(18.7256f, 1.92234f, 19.4315f, 1.91173f, 20.0142f, 2.23573f)
        curveTo(20.2557f, 2.37001f, 20.4862f, 2.60575f, 20.947f, 3.07721f)
        curveTo(21.4079f, 3.54868f, 21.6383f, 3.78441f, 21.7696f, 4.03149f)
        curveTo(22.0863f, 4.62767f, 22.0759f, 5.34971f, 21.7422f, 5.93611f)
        curveTo(21.6039f, 6.17913f, 21.3668f, 6.40783f, 20.8926f, 6.86523f)
        lineTo(15.2504f, 12.3075f)
        curveTo(13.7556f, 13.7493f, 12.8297f, 14.0483f, 10.7592f, 13.9941f)
        curveTo(10.3833f, 13.9842f, 10.1954f, 13.9793f, 10.0862f, 13.8551f)
        curveTo(9.9769f, 13.731f, 9.99182f, 13.5393f, 10.0216f, 13.1558f)
        curveTo(10.1592f, 11.3881f, 10.4706f, 10.4824f, 11.6737f, 9.17706f)
        lineTo(17.2442f, 3.13291f)
        }
        }.build()

        return _payByCheck!!
    }

private var _payByCheck: ImageVector? = null
