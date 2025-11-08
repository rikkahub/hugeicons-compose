package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.InboxUpload: ImageVector
    get() {
        if (_inboxUpload != null) {
            return _inboxUpload!!
        }
        _inboxUpload = ImageVector.Builder(
            name = "InboxUpload",
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
        moveTo(6.5f, 2.5f)
        curveTo(5.3579f, 2.68817f, 4.53406f, 3.03797f, 3.89124f, 3.6882f)
        curveTo(2.5f, 5.09548f, 2.5f, 7.36048f, 2.5f, 11.8905f)
        curveTo(2.5f, 16.4204f, 2.5f, 18.6854f, 3.89124f, 20.0927f)
        curveTo(5.28249f, 21.5f, 7.52166f, 21.5f, 12f, 21.5f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.0927f)
        curveTo(21.5f, 18.6854f, 21.5f, 16.4204f, 21.5f, 11.8905f)
        curveTo(21.5f, 7.36048f, 21.5f, 5.09548f, 20.1088f, 3.6882f)
        curveTo(19.4659f, 3.03797f, 18.6421f, 2.68817f, 17.5f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 5f)
        curveTo(9.99153f, 4.4943f, 11.2998f, 2.5f, 12f, 2.5f)
        moveTo(14.5f, 5f)
        curveTo(14.0085f, 4.4943f, 12.7002f, 2.5f, 12f, 2.5f)
        moveTo(12f, 2.5f)
        verticalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 13.5f)
        horizontalLineTo(16.5743f)
        curveTo(15.7322f, 13.5f, 15.0706f, 14.2036f, 14.6995f, 14.9472f)
        curveTo(14.2963f, 15.7551f, 13.4889f, 16.5f, 12f, 16.5f)
        curveTo(10.5111f, 16.5f, 9.70373f, 15.7551f, 9.30054f, 14.9472f)
        curveTo(8.92942f, 14.2036f, 8.26777f, 13.5f, 7.42566f, 13.5f)
        horizontalLineTo(2.5f)
        }
        }.build()

        return _inboxUpload!!
    }

private var _inboxUpload: ImageVector? = null
