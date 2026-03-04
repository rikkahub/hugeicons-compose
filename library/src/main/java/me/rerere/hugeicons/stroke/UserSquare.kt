package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.UserSquare: ImageVector
    get() {
        if (_userSquare != null) {
            return _userSquare!!
        }
        _userSquare = ImageVector.Builder(
            name = "UserSquare",
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
        moveTo(11.5001f, 2.5f)
        lineTo(12.5001f, 2.50001f)
        curveTo(16.7427f, 2.50006f, 18.864f, 2.50008f, 20.182f, 3.8181f)
        curveTo(21.5f, 5.13611f, 21.5f, 7.25741f, 21.5f, 11.5f)
        verticalLineTo(12.5001f)
        curveTo(21.5f, 16.7427f, 21.5f, 18.8641f, 20.182f, 20.1821f)
        curveTo(18.864f, 21.5001f, 16.7426f, 21.5001f, 12.5f, 21.5001f)
        horizontalLineTo(11.5f)
        curveTo(7.25736f, 21.5001f, 5.13604f, 21.5001f, 3.81802f, 20.1821f)
        curveTo(2.5f, 18.8641f, 2.5f, 16.7427f, 2.5f, 12.5001f)
        verticalLineTo(11.5f)
        curveTo(2.5f, 7.25732f, 2.5f, 5.13598f, 3.81804f, 3.81795f)
        curveTo(5.13607f, 2.49993f, 7.25741f, 2.49995f, 11.5001f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 7.39502f)
        curveTo(13.9329f, 7.39502f, 15.4999f, 8.96202f, 15.4999f, 10.895f)
        curveTo(15.4999f, 12.828f, 13.9329f, 14.395f, 11.9999f, 14.395f)
        curveTo(10.0669f, 14.395f, 8.49988f, 12.828f, 8.49988f, 10.895f)
        curveTo(8.49988f, 8.96202f, 10.0669f, 7.39502f, 11.9999f, 7.39502f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.9823f, 20.895f)
        curveTo(18.7259f, 17.2624f, 15.6978f, 14.395f, 11.9999f, 14.395f)
        curveTo(8.302f, 14.395f, 5.27383f, 17.2624f, 5.01746f, 20.895f)
        }
        }.build()

        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
