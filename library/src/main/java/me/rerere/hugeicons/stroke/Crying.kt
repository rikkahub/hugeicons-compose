package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Crying: ImageVector
    get() {
        if (_crying != null) {
            return _crying!!
        }
        _crying = ImageVector.Builder(
            name = "Crying",
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
        moveTo(15.5f, 21.3704f)
        curveTo(14.4107f, 21.7775f, 13.2313f, 22f, 12f, 22f)
        curveTo(10.7687f, 22f, 9.58933f, 21.7775f, 8.5f, 21.3704f)
        moveTo(3.33782f, 17f)
        curveTo(2.48697f, 15.5291f, 2f, 13.8214f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 13.8214f, 21.513f, 15.5291f, 20.6622f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15.9998f)
        curveTo(9.83563f, 15.372f, 10.8744f, 15f, 12f, 15f)
        curveTo(13.1256f, 15f, 14.1644f, 15.372f, 15f, 15.9998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 9.5f)
        horizontalLineTo(8.20711f)
        curveTo(7.75435f, 9.5f, 7.32014f, 9.67986f, 7f, 10f)
        moveTo(14.5f, 9.5f)
        horizontalLineTo(15.7929f)
        curveTo(16.2456f, 9.5f, 16.6799f, 9.67986f, 17f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 13f)
        lineTo(6f, 22f)
        moveTo(18f, 13f)
        verticalLineTo(22f)
        }
        }.build()

        return _crying!!
    }

private var _crying: ImageVector? = null
