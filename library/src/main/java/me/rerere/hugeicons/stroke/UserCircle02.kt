package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserCircle02: ImageVector
    get() {
        if (_userCircle02 != null) {
            return _userCircle02!!
        }
        _userCircle02 = ImageVector.Builder(
            name = "UserCircle02",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.75f, 9.5f)
        curveTo(14.75f, 11.0188f, 13.5188f, 12.25f, 12f, 12.25f)
        curveTo(10.4812f, 12.25f, 9.25f, 11.0188f, 9.25f, 9.5f)
        curveTo(9.25f, 7.98122f, 10.4812f, 6.75f, 12f, 6.75f)
        curveTo(13.5188f, 6.75f, 14.75f, 7.98122f, 14.75f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.49994f, 19.0001f)
        lineTo(6.06034f, 18.0194f)
        curveTo(6.95055f, 16.4616f, 8.60727f, 15.5001f, 10.4016f, 15.5001f)
        horizontalLineTo(13.5983f)
        curveTo(15.3926f, 15.5001f, 17.0493f, 16.4616f, 17.9395f, 18.0194f)
        lineTo(18.4999f, 19.0001f)
        }
        }.build()

        return _userCircle02!!
    }

private var _userCircle02: ImageVector? = null
