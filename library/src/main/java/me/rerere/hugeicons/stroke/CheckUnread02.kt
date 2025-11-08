package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CheckUnread02: ImageVector
    get() {
        if (_checkUnread02 != null) {
            return _checkUnread02!!
        }
        _checkUnread02 = ImageVector.Builder(
            name = "CheckUnread02",
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
        moveTo(2.5f, 13.5f)
        curveTo(2.5f, 13.5f, 4.5f, 14f, 6f, 17f)
        curveTo(6f, 17f, 6.28485f, 16.5192f, 6.82133f, 15.7526f)
        moveTo(16.5f, 6f)
        curveTo(14.9915f, 6.75423f, 13.4376f, 8.05457f, 12.0029f, 9.50285f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 13.5f)
        curveTo(7.5f, 13.5f, 9.5f, 14f, 11f, 17f)
        curveTo(11f, 17f, 11.7152f, 15.8948f, 12.8641f, 14.3641f)
        moveTo(21.5f, 6f)
        curveTo(19.1047f, 7.19763f, 16.5947f, 9.7722f, 14.6296f, 12.1296f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 5f)
        lineTo(17.5f, 19f)
        }
        }.build()

        return _checkUnread02!!
    }

private var _checkUnread02: ImageVector? = null
