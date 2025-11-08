package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MaximizeScreen: ImageVector
    get() {
        if (_maximizeScreen != null) {
            return _maximizeScreen!!
        }
        _maximizeScreen = ImageVector.Builder(
            name = "MaximizeScreen",
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
        moveTo(12.5667f, 7.93408f)
        lineTo(15.3088f, 8.03416f)
        curveTo(15.7163f, 8.04903f, 16.0391f, 8.38374f, 16.0391f, 8.79156f)
        verticalLineTo(11.4064f)
        moveTo(10.5391f, 13.4341f)
        lineTo(15.5828f, 8.41565f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 17f)
        curveTo(2f, 15.1144f, 2f, 14.1716f, 2.58579f, 13.5858f)
        curveTo(3.17157f, 13f, 4.11438f, 13f, 6f, 13f)
        horizontalLineTo(7f)
        curveTo(8.88562f, 13f, 9.82843f, 13f, 10.4142f, 13.5858f)
        curveTo(11f, 14.1716f, 11f, 15.1144f, 11f, 17f)
        verticalLineTo(18f)
        curveTo(11f, 19.8856f, 11f, 20.8284f, 10.4142f, 21.4142f)
        curveTo(9.82843f, 22f, 8.88562f, 22f, 7f, 22f)
        horizontalLineTo(6f)
        curveTo(4.11438f, 22f, 3.17157f, 22f, 2.58579f, 21.4142f)
        curveTo(2f, 20.8284f, 2f, 19.8856f, 2f, 18f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        verticalLineTo(10.5f)
        moveTo(14f, 2f)
        horizontalLineTo(10f)
        moveTo(22f, 14f)
        verticalLineTo(10f)
        moveTo(13.5f, 22f)
        horizontalLineTo(15.5f)
        moveTo(2.05986f, 5.5f)
        curveTo(2.21387f, 4.43442f, 2.51347f, 3.67903f, 3.09625f, 3.09625f)
        curveTo(3.67903f, 2.51347f, 4.43442f, 2.21387f, 5.5f, 2.05986f)
        moveTo(18.5f, 2.05986f)
        curveTo(19.5656f, 2.21387f, 20.321f, 2.51347f, 20.9037f, 3.09625f)
        curveTo(21.4865f, 3.67903f, 21.7861f, 4.43442f, 21.9401f, 5.5f)
        moveTo(21.9401f, 18.5f)
        curveTo(21.7861f, 19.5656f, 21.4865f, 20.321f, 20.9037f, 20.9037f)
        curveTo(20.321f, 21.4865f, 19.5656f, 21.7861f, 18.5f, 21.9401f)
        }
        }.build()

        return _maximizeScreen!!
    }

private var _maximizeScreen: ImageVector? = null
